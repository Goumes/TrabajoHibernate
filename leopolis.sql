/***** Object:  Database Leopolis     ******/
CREATE DATABASE Leopolis
 GO
USE Leopolis
GO
/****** Object:  Table Matrimonios  ******/

CREATE TABLE Matrimonios(
	ID int IDENTITY(1,1) NOT NULL CONSTRAINT PK_MATRIMONIOS PRIMARY KEY,
	IDConyuge1 int NOT NULL,
	IDConyuge2 int NOT NULL,
	Fecha_matrimonio date NOT NULL,
	Fecha_fin date NULL
	,CONSTRAINT CK_NoSelfMarriage CHECK (IDConyuge1 <> IDConyuge2)
	,Constraint CK_NoFutureMarriage Check (Fecha_Matrimonio < Current_Timestamp)
	,Constraint CK_MarriageBeforeDivorce Check (Fecha_Matrimonio < Fecha_Fin)
) 

GO
/****** Object:  Table Ciudadanes ******/

CREATE TABLE Ciudadanes(
	ID int NOT NULL,
	ID_madre int NULL,
	ID_padre int NULL,
	nombre nvarchar(15) NOT NULL,
	apellidos nvarchar(40) NOT NULL,
	Fecha_nacimiento date NOT NULL,
	Fecha_muerte date NULL,
	Sexo char(1) NOT NULL,
	Pasta_favorita char(25) NOT NULL,
	KG_pasta smallint NOT NULL,
	CONSTRAINT PK_Ciudadanes PRIMARY KEY (ID),
	Constraint CK_NoDarthVader Check (ID <> Id_Padre),
	Constraint CK_NoAmidala Check (ID <> Id_Madre),
	Constraint CK_NoAutoFecundation Check (ID_Padre <> Id_Madre)
) 

GO
/****** Object:  Table Pastas  ******/

CREATE TABLE Pastas(
	NombrePasta char(25) NOT NULL
 CONSTRAINT PK_Pasta PRIMARY KEY 
)

GO
SET IDENTITY_INSERT Matrimonios ON
GO
INSERT Matrimonios (ID, IDConyuge1, IDConyuge2, Fecha_matrimonio, Fecha_fin) VALUES (1, 3, 1, CAST('1980-04-17' AS Date), CAST('2005-09-14' AS Date))
, (2, 12, 2, CAST('1970-05-03' AS Date), NULL)
, (3, 48, 46, CAST('1945-01-10' AS Date), CAST('1985-04-22' AS Date))
, (4, 49, 32, CAST('1980-02-21' AS Date), CAST('1985-07-11' AS Date))
, (5, 36, 55, CAST('2000-01-25' AS Date), NULL)
, (6, 50, 29, CAST('2014-10-06' AS Date), NULL)
SET IDENTITY_INSERT Matrimonios OFF

GO
INSERT Ciudadanes (ID, ID_madre, ID_padre, nombre, apellidos, Fecha_nacimiento, Fecha_muerte, Sexo, Pasta_favorita, KG_pasta) VALUES (1, NULL, NULL, N'Bartolina', N'Baleares', CAST(N'1960-02-12' AS Date), NULL, N'M', N'Canelones', 45)
, (2, NULL, NULL, N'Protasia', N'Espiolea', CAST('1946-01-01' AS Date), NULL,'M', 'Canelones', 25)
, (3, NULL, NULL, N'Tentudio', N'Melocoton', CAST('1952-07-06' AS Date), NULL, 'H','Pizza', 29)
, (4, NULL, NULL, N'Sinibaldo', N'Currupipi', CAST('1950-10-06' AS Date), CAST('2013-05-09' AS Date), N'H', N'Ravioli', 67)
, (5, 1, 3, N'Zosimo', N'Melocoton', CAST(N'1982-12-06' AS Date), NULL, N'M', N'Spagueti', 451)
INSERT Ciudadanes (ID, ID_madre, ID_padre, nombre, apellidos, Fecha_nacimiento, Fecha_muerte, Sexo, Pasta_favorita, KG_pasta) VALUES (6, 1, 3, N'Leonino', N'Escobilla', CAST('1984-01-06' AS Date), NULL, 'H', 'Tortellini', 21)
, (7, 2, 4, N'Casimira', N'Escalada', CAST('1984-02-06' AS Date), NULL, 'M', 'Spagueti', 17)
, (8, 7, 5, N'Setefilla', N'Laca�ina', CAST(N'2007-03-01' AS Date), NULL, 'M', 'Fetuccini', 10)
, (9, 1, 3, N'Rafaela', N'Cangrejo', CAST(N'1995-02-04' AS Date), CAST(N'2001-06-12' AS Date), 'M', 'Pizza', 567)
, (10, NULL, NULL, N'Evelina', N'Desconchon', CAST(N'1991-05-05' AS Date), NULL, N'M', N'Lasagna', 15)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (11, NULL, 4, N'Angela', N'Burguillos', CAST('1992-05-06' AS Date), NULL, 'M', 'Canelones', 120)
, (12, NULL, NULL, N'Pier', N'Burguillos', CAST('1938-10-06' AS Date), NULL, 'H', 'Spagueti', 2)
, (13, 10, NULL, N'Fernando', N'Pimpinelo', CAST('2010-07-06' AS Date), NULL, 'H', 'Tortellini', 30)
, (14, NULL, NULL, N'Porfirio', N'Escalpelo', CAST(N'1912-02-04' AS Date), CAST(N'2011-01-09' AS Date), N'H', N'Tortellini', 37)
, (15, NULL, 12, N'Miren', N'de la Vega', CAST(N'1971-10-03' AS Date), NULL, N'M', N'Pizza', 34)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (16, 7, 5, N'Eufrasio', N'Cantalaina', CAST(N'2004-02-06' AS Date), NULL, N'M', N'Canelones', 45)
, (17, NULL, 14, N'Cayetano', N'Siguenza', CAST(N'1942-05-11' AS Date), NULL, N'H', N'Spagueti', 45)
, (18, NULL, NULL, N'Evaristo', N'Tura', CAST(N'1951-02-03' AS Date), NULL, N'H', N'Tortellini', 17)
, (19, NULL, 4, N'Wenceslao', N'Pino', CAST(N'1969-03-03' AS Date), CAST(N'2013-05-09' AS Date), N'H', N'Pizza', 20)
, (20, NULL, 19, N'Emiliano', N'Escobilla', CAST(N'1991-06-03' AS Date), NULL, N'H', N'Spagueti', 46)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (21, 15, NULL, N'Rocco', N'Sigfredo', CAST(N'1996-03-03' AS Date), NULL, N'H', N'Pizza', 20)
, (22, NULL, NULL, N'Amadeo', N'De la Rosa', CAST(N'1991-10-03' AS Date), NULL, N'H', N'Spagueti', 41)
, (23, NULL, NULL, N'Herminia', N'Tura', CAST(N'1923-10-09' AS Date), CAST(N'2001-07-14' AS Date), N'M', N'Tortellini', 38)
, (24, NULL, NULL, N'Fulgencio', N'Espiolea', CAST(N'1981-03-03' AS Date), NULL, N'H', N'Canelones', 45)
, (25, NULL, NULL, N'Leonardo', N'Cabanillas', CAST(N'1900-02-12' AS Date), CAST(N'2007-01-10' AS Date), N'H', N'Canelones', 10)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (26, NULL, 24, N'Melardo', N'Pino', CAST(N'2004-01-08' AS Date), NULL, N'H', N'Spagueti', 11)
, (27, 23, 25, N'Felipa', N'Gonzalez', CAST(N'1950-04-03' AS Date), NULL, N'M', N'Macarrones', 12)
, (28, 15, 18, N'Petronila', N'Rebollo', CAST(N'1990-02-04' AS Date), NULL, N'M', N'Macarrones', 87)
, (29, NULL, 18, N'Eduvigis', N'Regomello', CAST(N'1992-01-06' AS Date), NULL, N'M', N'Pizza', 15)
, (30, NULL, NULL, N'Teoduceo', N'Calcamillas', CAST(N'1974-04-04' AS Date), CAST(N'2013-05-10' AS Date), N'H', N'Ravioli', 24)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (31, NULL, NULL, N'Angel Luis', N'Ulloa', CAST('1976-09-01' AS Date), NULL, 'H', N'Tagliatelle', 55)
, (32, NULL, NULL, N'Desidonia', N'Tarancon', CAST('1960-02-12' AS Date), NULL, N'M', N'Tortellini', 67)
, (33, NULL, 18, N'Carolo', N'Cabrera', CAST(N'1968-02-02' AS Date), NULL, N'H', N'Pizza', 16)
, (34, NULL, NULL, N'Rycky', N'Minglanillas', CAST(N'1969-08-11' AS Date), NULL, N'H', N'Macarrones', 259)
, (35, NULL, NULL, N'Clodovea', N'Cabrera', CAST(N'1960-03-05' AS Date), NULL, N'M', N'Pizza', 45)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (36, 32, NULL, N'Ursilinio', N'Regomello', CAST(N'1978-02-12' AS Date), NULL, N'H', N'Canelones', 57)
, (37, NULL, 30, N'Pompilio', N'Carmona', CAST(N'1993-01-12' AS Date), NULL, N'H', N'Tagliatelle', 16)
, (38, NULL, 36, N'Sequedo', N'Di Maria', CAST(N'2003-02-06' AS Date), NULL, N'H', N'Macarrones', 12)
, (39, 35, NULL, N'Bolusiano', N'Alcaparra', CAST(N'1991-10-02' AS Date), NULL, N'H', N'Spagueti', 10)
, (40, 35, 34, N'Mandilio', N'Gomez', CAST(N'1994-02-12' AS Date), CAST(N'2001-10-05' AS Date), N'H', N'Tortellini', 26)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (41, NULL, NULL, N'Capitolino', N'Sanchez', CAST(N'1991-02-07' AS Date), NULL, N'H', N'Spagueti', 15)
, (42, NULL, NULL, N'Querem�n', N'de la guardia', CAST(N'1993-02-07' AS Date), NULL, N'H', N'Pizza', 28)
, (43, 29, 41, N'Antero', N'Espartero', CAST(N'2014-02-03' AS Date), NULL, N'H', N'Pizza', 250)
, (44, NULL, 34, N'Claudinete', N'Minglanillas', CAST(N'1989-01-01' AS Date), NULL, N'H', N'Macarrones', 22)
, (45, NULL, NULL, N'Climaco', N'Gutierrez', CAST(N'1980-01-12' AS Date), NULL, N'H', N'Tagliatelle', 11)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (46, NULL, NULL, N'Aroa', N'Ulloa', CAST(N'1938-02-09' AS Date), NULL, N'M', N'Macarrones', 10)
, (47, NULL, NULL, N'Aquiles', N'Tarancon', CAST(N'2001-02-05' AS Date), NULL, N'H', N'Tortellini', 23)
, (48, NULL, NULL, N'Rinofito', N'Minglanillas', CAST(N'1921-10-02' AS Date), CAST(N'2010-06-11' AS Date), N'H', N'Tortellini', 29)
, (49, 46, 48, N'Rigoberto', N'Calcamillas', CAST(N'1957-10-01' AS Date), NULL, N'H', N'Pizza', 50)
, (50, NULL, NULL, N'Adalberto', N'Pendulon', CAST(N'1990-10-10' AS Date), NULL, N'H', N'Tortellini', 23)
INSERT Ciudadanes ([ID], [ID_madre], [ID_padre], [nombre], [apellidos], [Fecha_nacimiento], [Fecha_muerte], [Sexo], [Pasta_favorita], [KG_pasta]) VALUES (51, 7, 45, N'Norberto', N'Laina', CAST(N'2000-02-12' AS Date), NULL, N'H', N'Canelones', 50)
, (52, 46, 18, N'Mandolino', N'Singorrio', CAST(N'1960-06-11' AS Date), NULL, N'H', N'Pizza', 23)
, (53, NULL, NULL, N'Bandurrio', N'Perez', CAST(N'1980-01-10' AS Date), NULL, N'H', N'Tagliatelle', 27)
, (54, NULL, 52, N'Carcamala', N'Jimenez', CAST(N'1991-05-07' AS Date), NULL, N'M', N'Pizza', 35)
, (55, NULL, 49, N'Vidala', N'Carmona', CAST(N'1978-02-04' AS Date), NULL, N'M', N'Canelones', 16)
, (56, 55, 44, N'Sisinanda', N'Segovina', CAST(N'2011-03-03' AS Date), CAST(N'2013-05-09' AS Date), N'M', N'Pizza', 65)
, (57, 54, NULL, N'Consorcia', N'Perez', CAST(N'2010-11-10' AS Date), CAST(N'2013-05-09' AS Date), N'M', N'Tortellini', 45)
GO
INSERT Pastas (NombrePasta) VALUES ('Canelones')
,('Fetuccini'), ('Fideos'), ('Fusili'), ('Gnocchi'), ('Lasagna'),('Macarrones'), ('Parpadelle')
INSERT Pastas (NombrePasta) VALUES ('Penne'), ('Pizza'), ('Ravioli'), ('Spagueti'), (N'Tagliatelle'), ('Tortellini')
ALTER TABLE Matrimonios WITH CHECK ADD CONSTRAINT FK_PastafarisConyuge1 FOREIGN KEY(IDConyuge1)
REFERENCES Ciudadanes (ID)
GO
ALTER TABLE Matrimonios CHECK CONSTRAINT FK_PastafarisConyuge1
GO
ALTER TABLE Matrimonios  WITH CHECK ADD  CONSTRAINT [FK_PastafarisConyuge2] FOREIGN KEY(IDConyuge2)
REFERENCES Ciudadanes (ID)
GO
ALTER TABLE Matrimonios CHECK CONSTRAINT FK_PastafarisConyuge2
GO
ALTER TABLE Ciudadanes  WITH CHECK ADD  CONSTRAINT FK_Pasta FOREIGN KEY(Pasta_favorita)
REFERENCES Pastas (NombrePasta)
GO
ALTER TABLE Ciudadanes CHECK CONSTRAINT FK_Pasta
GO
ALTER TABLE Ciudadanes  WITH CHECK ADD  CONSTRAINT FK_PASTAFARIS_MADRES FOREIGN KEY(ID_madre)
REFERENCES Ciudadanes (ID)
GO
ALTER TABLE Ciudadanes CHECK CONSTRAINT FK_PASTAFARIS_MADRES
GO
ALTER TABLE Ciudadanes  WITH CHECK ADD  CONSTRAINT FK_PASTAFARIS_PADRES FOREIGN KEY(ID_padre)
REFERENCES Ciudadanes (ID)
GO
ALTER TABLE Ciudadanes CHECK CONSTRAINT FK_PASTAFARIS_PADRES
GO
ALTER TABLE Ciudadanes  WITH CHECK ADD  CONSTRAINT [CK_SEXO] CHECK  (([Sexo]='M' OR [Sexo]='H'))
GO
ALTER TABLE Ciudadanes CHECK CONSTRAINT [CK_SEXO]
Go
-- Evita que alguien pueda casarse con una persona que ha fallecido

Create Trigger NoNecrophilia On Matrimonios For Insert, Update AS
Begin
	If Exists (
		Select * From Inserted AS I Join Ciudadanes AS C
			ON I.IDConyuge1 = C.ID OR I.IDConyuge2=C.ID
			Where Fecha_matrimonio > C.Fecha_Muerte
		)
	Begin
		THROW 51000, 'Any groom or bride died before the marriage.', 1;
		RollBack
	End -- If
End		--Trigger NoNecrophilia

Go
--Funci�n que nos dice si un ciudadane est� soltere en una fecha determinada
-- Devuelve un 1 si est� soltere y un 0 si est� casade
Create Function IsSingle (@IDCiudadano Int, @Fecha Date) Returns Bit AS
Begin
	Declare @Single Bit = 1
	If Exists(
			SELECT * From Matrimonios 
			Where IDConyuge1 = @IDCiudadano OR IDConyuge2 = @IDCiudadano AND Fecha_matrimonio < @Fecha
				AND (Fecha_fin > @Fecha OR Fecha_fin IS NULL)
		)
		SET @Single = 0
		-- End IF
	Return @Single
End	-- Function IsSingle
Go
--Evita la poligamia
Create Trigger NoPolygamy On Matrimonios For Insert, Update AS
-- Evita que alguien que est� casado pueda casarse de nuevo
Begin
	If 1 = ANY (Select dbo.IsSingle(IDConyuge1,Fecha_MAtrimonio) FROM Inserted UNION Select dbo.IsSingle(IDConyuge2,Fecha_Matrimonio) FROM Inserted)
	Begin
		THROW 51001, 'Any groom or bride is already married', 1;
		RollBack
	End -- If
End		--Trigger NoPolygamy
GO
--Dos hermanos no pueden casarse 
Create Trigger NoIncest On Matrimonios For Insert, Update AS
Begin
	If Exists (
		Select * From Inserted AS I Join Ciudadanes AS C1
			ON I.IDConyuge1 = C1.ID 
			Inner Join Ciudadanes AS C2 ON I.IDConyuge2=C2.ID
			Where C1.ID_madre=C2.ID_madre OR C1.ID_padre = C2.ID_padre
		)
	Begin
		THROW 51002, 'Any groom or bride are brothers or sisters', 1;
		RollBack
	End -- If
End		--Trigger NoIncest
GO
USE master
GO
ALTER DATABASE Leopolis SET  READ_WRITE 
GO
