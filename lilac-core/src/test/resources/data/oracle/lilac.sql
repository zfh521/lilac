SELECT *
  FROM v$sql v
 where v.SQL_TEXT like '%org%'
 order by v.LAST_LOAD_TIME desc;

SELECT * FROM object_type;
