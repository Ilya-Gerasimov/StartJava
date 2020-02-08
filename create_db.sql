-- Create Table Jaegers1


CREATE TABLE jaegers1 (
      id              SERIAL PRIMARY KEY,
      modelName       TEXT,
      mark            TEXT,
      height          double precision,
      weight          double precision,
      status          TEXT,
      origin          TEXT,
      launch          DATE,
      kaijuKill       INTEGER
 );
