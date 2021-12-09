(:
distinct-values(doc("voos.xml")//passageiro/pais)
:)
(:
doc("voos.xml")//voo[contains(@id, "FR" )]
:)
(:
for $voo in doc("voos.xml")//voo
return if($voo[contains(@id,"FR")]) then
<voo id = "{$voo/@id}">
 <origem>{//aeroporto[@abreviatura = $voo/origem]/nome}</origem>
 <destino>{//aeroporto[@abreviatura = $voo/destino]/nome}</destino>
</voo>
:)



