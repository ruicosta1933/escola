(: for $c in doc("cursos.xml")//cursos
    
   return <nome>{$c/curso/nome}</nome>:)
   
(: for $c in doc("cursos.xml")//curso
   where $c/disciplinas/disciplina = "Estatística"
   return $c/diretor_curso :)
   
  (: for $c in doc("cursos.xml")//curso
   where $c/@numero_vagas>30
   return $c/nome:)
   
   
   (: for $c in doc("cursos.xml")//curso
   where count( $c/disciplinas/disciplina) = 5
   return $c/nome:)
   
   (:let $c := count(distinct-values(//disciplina))
   return $c:)
   
   
   
   
   