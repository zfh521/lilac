SELECT * FROM USER_INFO t for update;
SELECT count(*) FROM USER_INFO t;
SELECT sys_guid() from dual;
delete from user_info t where t.instance_rrn != 'SYSTEM';
