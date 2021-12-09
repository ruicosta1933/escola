 (:for $c in doc("turismo.xml")//cliente
   where $c/morada/distrito = "Braga"
   order by $c
   return $c/nome:)
   
   for $r in doc("turismo.xml")//reserva
   let $nomeHotel := //hotel[@id = $r/@hotel]/nome/text()
   let $nomeCliente := //cliente [@id=$r/@cliente]/nome/text()
  
   order by $nomeHotel descending , $nomeCliente ascending
  
   return <reserva idReserva="{$r/@id}">
     <nomeHotel>{$nomeHotel}</nomeHotel>
     <nomeCliente>{$nomeCliente}</nomeCliente>
     {if($r/numeroNoites/text()>7)
     then <tipoEstadia>Longa</tipoEstadia>
     else <tipoEstadia>Curta</tipoEstadia>}
    
   </reserva>
   