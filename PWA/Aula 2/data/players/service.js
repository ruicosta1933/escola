function PlayerService(PlayerModel){
    let service = {
        create,
        findAll
    };

    function create(values){
        let newPlayer = PlayerModel(values);
        return save(newPlayer);
    }

    function save (newPlayer){
        return new Promise(function (resolve, reject){
            newPlayer.save(function (err){
                if(err) reject(err);

                resolve('player created!');
            });
        });
    }

    function findAll(){
        return new Promise(function(resolve, reject){
            PlayerModel.find({}, function(err, users){
                if(err) reject(err);

                resolve(users);
            })
        })
    }
    return service;
}

module.exports = PlayerService;