CREATE DATABASE [alunos]
GO

USE [alunos]
GO
/****** Object:  Table [dbo].[alunos]    Script Date: 26/01/2021 20:16:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[alunos](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[age] [int] NULL,
	[weight] [decimal](10, 2) NULL,
	[height] [decimal](10, 2) NULL,
	[goal] [varchar](50) NULL,

CONSTRAINT [PK_alunos] PRIMARY KEY CLUSTERED (
	[id] ASC
)
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
