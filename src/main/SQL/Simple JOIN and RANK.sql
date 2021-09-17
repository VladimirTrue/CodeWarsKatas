select p.id as id, p.name as name, count(s.sale) as sale_count, count(s.price) as sale_rank from people p left join sales s ON p.id = s.people_ID group by p.id order by sale_count; 



/*For this challenge you need to create a simple SELECT statement that will return all columns from the people table, and join to the sales table so that you can return the COUNT of all sales and RANK each person by their sale_count.

people table schema
id
name
sales table schema
id
people_id
sale
price
You should return all people fields as well as the sale count as "sale_count" and the rank as "sale_rank".*/
