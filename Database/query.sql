USE [master]
GO
/****** Object:  Database [CrazyClothing]    Script Date: 28/12/2015 4:45:43 CH ******/
CREATE DATABASE [CrazyClothing]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CrazyClothing', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\CrazyClothing.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'CrazyClothing_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\CrazyClothing_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [CrazyClothing] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CrazyClothing].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CrazyClothing] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CrazyClothing] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CrazyClothing] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CrazyClothing] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CrazyClothing] SET ARITHABORT OFF 
GO
ALTER DATABASE [CrazyClothing] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CrazyClothing] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [CrazyClothing] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CrazyClothing] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CrazyClothing] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CrazyClothing] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CrazyClothing] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CrazyClothing] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CrazyClothing] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CrazyClothing] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CrazyClothing] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CrazyClothing] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CrazyClothing] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CrazyClothing] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CrazyClothing] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CrazyClothing] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CrazyClothing] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CrazyClothing] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CrazyClothing] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CrazyClothing] SET  MULTI_USER 
GO
ALTER DATABASE [CrazyClothing] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CrazyClothing] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CrazyClothing] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CrazyClothing] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [CrazyClothing]
GO
/****** Object:  Table [dbo].[Cloth]    Script Date: 28/12/2015 4:45:43 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cloth](
	[clothID] [varchar](6) NOT NULL,
	[groupClothID] [varchar](6) NULL,
	[clothName] [nvarchar](500) NULL,
	[quantity] [int] NULL,
	[description] [nvarchar](500) NULL,
	[price] [float] NULL,
	[sale] [int] NOT NULL,
 CONSTRAINT [PK_Cloth] PRIMARY KEY CLUSTERED 
(
	[clothID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 28/12/2015 4:45:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Customer](
	[customerID] [varchar](6) NOT NULL,
	[customerName] [nvarchar](50) NULL,
	[email] [varchar](50) NULL,
	[address] [nvarchar](500) NULL,
	[phoneNumber] [varchar](20) NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[rule] [int] NOT NULL,
	[status] [int] NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[customerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[GroupCloth]    Script Date: 28/12/2015 4:45:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[GroupCloth](
	[groupID] [varchar](6) NOT NULL,
	[groupName] [nvarchar](500) NULL,
	[image] [varchar](500) NOT NULL,
	[groupTop] [varchar](6) NOT NULL,
 CONSTRAINT [PK_GroupCloth] PRIMARY KEY CLUSTERED 
(
	[groupID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order]    Script Date: 28/12/2015 4:45:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[orderID] [varchar](6) NOT NULL,
	[customerID] [varchar](6) NULL,
	[time] [date] NOT NULL,
	[totalMoney] [float] NOT NULL,
	[status] [int] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 28/12/2015 4:45:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[orderDetailID] [varchar](6) NOT NULL,
	[orderID] [varchar](6) NULL,
	[clothID] [varchar](6) NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[orderDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Cloth]  WITH CHECK ADD  CONSTRAINT [FK_Cloth_GroupCloth] FOREIGN KEY([groupClothID])
REFERENCES [dbo].[GroupCloth] ([groupID])
GO
ALTER TABLE [dbo].[Cloth] CHECK CONSTRAINT [FK_Cloth_GroupCloth]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer] FOREIGN KEY([customerID])
REFERENCES [dbo].[Customer] ([customerID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Cloth] FOREIGN KEY([clothID])
REFERENCES [dbo].[Cloth] ([clothID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Cloth]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Order] FOREIGN KEY([orderID])
REFERENCES [dbo].[Order] ([orderID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Order]
GO
USE [master]
GO
ALTER DATABASE [CrazyClothing] SET  READ_WRITE 
GO
