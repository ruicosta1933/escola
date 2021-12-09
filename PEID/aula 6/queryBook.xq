(:declare function local:getLivro($nome as xs:string) as element()*
{
  let $livros := doc("bookstore.xml")//book[.//author = $nome]
  return  $livros
};
 local:getLivro("Giada De Laurentiis"):)
 
(: declare function local:estadoLivro()
 {
   
   for $b in doc("bookstore.xml")//book
   
   return <book category="{$b/@category}">
        
   {$b//title , $b//author, $b//year}
     
     <state>
       {if( $b//year >= 2010)
     then "ESTA NOBO"
   else "ESTA BELHO"}
     </state>
   
         </book>
 };
 local:estadoLivro():)
 
 (:
 
 count(doc("bookstore.xml")//book[year<2008]):)
 
 
 (: some $price in doc("bookstore.xml")//price satisfies ($price < 5) :)
 

 (:  let $b := doc("bookstore.xml")//book
   return if( some $category in doc("bookstore.xml")//book/@category satisfies ($category="CHILDREN")) then $b  :)
   
 (:  let $b := doc("bookstore.xml")//book
   return if( every $price in doc("bookstore.xml")//book/price satisfies ($price<60)) then $b :)
   
   
 
 
  