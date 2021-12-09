function PlayerService(PlayerModel) {
    let service = {
        create,
        findAll
    };

    function create(values) {
        let newPlayer = PlayerModel(values);
        return save(newPlayer);
    }

    function save(newPlayer) {
        return new Promise(function (resolve, reject) {
            newPlayer.save(function (err) {
                if (err) reject(err);

                resolve('player created!');
            });
        });
    }

    function findById(id) {
        return new Promise(function (resolve, reject) {
            PlayerModel.findById(id, function (err, user) {
                if (err) reject(err);

                resolve(err);
            })
        })
    }

    function update(id, values) {
    return new Promise(function (resolve, reject) {
        // do a thing, possibly async, then...
        //values {name : jose} || (lastName: Jose} | | {name: j, lastName: g}
        PlayerModel.findByIdAndUpdate(id, values, function (err, user) {
            if (err) reject(err);
            resolve(user);
        });
    });
    function removeById(id) {
        return new Promise(function (resolve, reject) {
            // do a thing, possibly async, then...
            console.log(id);
            PlayerModel.findByIdAndRemove(id, function (err) {
                console.log(err);
                if (err) reject(err);
                resolve();
                });
            });
        }
    }

    function findAll() {
        return new Promise(function (resolve, reject) {
            PlayerModel.find({}, function (err, users) {
                if (err) reject(err);

                resolve(users);
            })
        })
    }
    return service;
}

module.exports = PlayerService;