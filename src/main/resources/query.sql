delete  from books;

select * from users;

select * from books;

insert into books(id, author, category, title, year, owner_id)

values(1, 'J.k.Rouling', 'roman-fantasy', 'Harry Potter',1997, 1),
(2, 'Jules Verne','fantasy','Misterious Island',1875, 10),
(3, 'Stephen King','Thriller','The Green Mil',1995,4),
(4, 'Jane austen','roman', 'Pride and Prejudice', 1813, 10),
(5, 'Paulo Coelho', 'roman', 'The Alchemist', 1988,4),
(6, 'William Shakespeare', 'Tragedy', 'Hamlet', 1599-1601, 1);

delete from roles;
select * from users;


select * from users_roles;


insert into roles(id, name)
values
(1,'User'),
(2,'Admin'),
(3,'Super_Admin');

select * from roles;

insert into users_roles(user_id, roles_id)
values
(1, 1),
(1, 2),
(3, 3),
(3, 2)