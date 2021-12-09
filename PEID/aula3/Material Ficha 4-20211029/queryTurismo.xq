(://clientes:)

(://agencia/nome:)

(:distinct-values(//hoteis/hotel/morada/distrito):)

(://hotel[1]/nome:)

(://cliente/morada[contains(distrito,"Braga")]/codigoPostal:)

(://reserva[@hotel=1]/numeroNoites:)


(:sum(//reserva[@hotel=1]/numeroHospedes):)

(://hotel/*[3]:)

(://hotel[caracteristicas/caracteristica[contains(.,"ginásio")]]/nome:)

(:sum(//reserva[@hotel=2]/preco):)

(://reserva[count(pedidosCliente)=0]/@id:)

(:avg(//numeroNoites):)
