(:
  for $c in doc("cd_catalog.xml")//CD
  where $c/YEAR>1980 and $c/YEAR<1990
  order  by $c/YEAR
  return $c
  :)
(:  <CDS>{
     for $c in doc("cd_catalog.xml")//CD
   where  $c/YEAR>=1990 and $c/YEAR<2000
  return  <CD><title>{ $c/TITLE/text()}</title><price>{ $c/PRICE/text()}</price></CD>
}</CDS>:)


  (: let $c:= count(//CD)
    
   return <total>{$c}</total>:)
   
   
 

