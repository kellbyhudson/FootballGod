
CREATE TABLE SortOrder (
                SortOrderId INT AUTO_INCREMENT NOT NULL,
                PositionName VARCHAR(30),
                PRIMARY KEY (SortOrderId)
);


CREATE TABLE CoachSpecialty (
                CoachSpecialtyId INT AUTO_INCREMENT NOT NULL,
                CoachSpecialtyName VARCHAR(20) NOT NULL,
                PRIMARY KEY (CoachSpecialtyId)
);


CREATE TABLE Coach (
                CoachId INT AUTO_INCREMENT NOT NULL,
                CoachName VARCHAR(50) NOT NULL,
                CoachValue INT NOT NULL,
                CoachSpecialtyId INT NOT NULL,
                CoachTier INT NOT NULL,
                CoachPicture LONGBLOB,
                PRIMARY KEY (CoachId)
);


CREATE TABLE PlayerPosition (
                PlayerPositionId INT AUTO_INCREMENT NOT NULL,
                PlayerPositionName VARCHAR(30) NOT NULL,
                UnitId INT NOT NULL,
                PRIMARY KEY (PlayerPositionId)
);


CREATE TABLE Player (
                PlayerId INT AUTO_INCREMENT NOT NULL,
                PlayerName VARCHAR(50) NOT NULL,
                PlayerAge INT NOT NULL,
                PlayerValue INT DEFAULT 0 NOT NULL,
                PlayerHeightFeet INT DEFAULT 0 NOT NULL,
                PlayerHeightInches INT DEFAULT 0 NOT NULL,
                PlayerWeight INT DEFAULT 0 NOT NULL,
                YearsExperience INT DEFAULT 0,
                PlayerCollege VARCHAR(50),
                PlayerPositionId INT DEFAULT 1 NOT NULL,
                PRIMARY KEY (PlayerId)
);


CREATE TABLE TakeOverOrganization (
                TakeOverOrganizationId INT AUTO_INCREMENT NOT NULL,
                TakeOverOrganizationName VARCHAR(30) NOT NULL,
                OrganizationSalaryCap INT NOT NULL,
                Picture LONGBLOB,
                PRIMARY KEY (TakeOverOrganizationId)
);


CREATE TABLE Owner (
                OwnerId INT AUTO_INCREMENT NOT NULL,
                OwnerName VARCHAR(50) NOT NULL,
                OwnerEmail VARCHAR(50) NOT NULL,
                OwnerPassword VARCHAR(15) NOT NULL,
                PRIMARY KEY (OwnerId)
);


CREATE TABLE Team (
                TeamId INT AUTO_INCREMENT NOT NULL,
                TeamName VARCHAR(50) NOT NULL,
                TeamCity VARCHAR(50) NOT NULL,
                OwnerId INT NOT NULL,
                CoachId INT NOT NULL,
                TakeOverOrganizationId INT NOT NULL,
                TeamSalary INT DEFAULT 0,
                PRIMARY KEY (TeamId)
);


CREATE TABLE TeamPlayer (
                TeamPlayerId INT AUTO_INCREMENT NOT NULL,
                PlayerId INT NOT NULL,
                TeamId INT NOT NULL,
                TeamPlayerName VARCHAR(50) NOT NULL,
                TeamPlayerValue INT NOT NULL,
                TeamPlayerPositionId INT NOT NULL,
                SortOrderId INT NOT NULL,
                PRIMARY KEY (TeamPlayerId)
);


ALTER TABLE TeamPlayer ADD CONSTRAINT sortorder_teamplayer_fk
FOREIGN KEY (SortOrderId)
REFERENCES SortOrder (SortOrderId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Coach ADD CONSTRAINT coachspecialty_coach_fk
FOREIGN KEY (CoachSpecialtyId)
REFERENCES CoachSpecialty (CoachSpecialtyId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Team ADD CONSTRAINT coach_team_fk
FOREIGN KEY (CoachId)
REFERENCES Coach (CoachId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Player ADD CONSTRAINT playerposition_player_fk
FOREIGN KEY (PlayerPositionId)
REFERENCES PlayerPosition (PlayerPositionId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE TeamPlayer ADD CONSTRAINT player_teamplayer_fk
FOREIGN KEY (PlayerId)
REFERENCES Player (PlayerId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Team ADD CONSTRAINT takeoverorganization_team_fk
FOREIGN KEY (TakeOverOrganizationId)
REFERENCES TakeOverOrganization (TakeOverOrganizationId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Team ADD CONSTRAINT owner_team_fk
FOREIGN KEY (OwnerId)
REFERENCES Owner (OwnerId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE TeamPlayer ADD CONSTRAINT team_teamplayer_fk
FOREIGN KEY (TeamId)
REFERENCES Team (TeamId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
