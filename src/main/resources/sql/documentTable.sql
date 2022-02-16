
-- 业务资料表
CREATE TABLE `document` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',  -- AUTO_INCREMENT可使id递增
  `document_id` int(10) NOT NULL COMMENT '文件id',  -- 标识该文档
  `version_id` int(10) NOT NULL COMMENT '版本id',  -- 标识该文档修改版本
  `history_document_id` varchar(200) COMMENT '关联历史文件id',  -- 存储关联历史文件最新版id，如1-1,1-4,2-3
  `document_name` varchar(200) NOT NULL COMMENT '上传文件名称', -- 确保足够容下文件名称
  `document_secret_level` varchar(50) NOT NULL COMMENT '上传文件密',
  `document_release_number` varchar(50) COMMENT '上传文件号',
  `document_release_time` varchar(50) COMMENT '上传文件发布时间',
  `operator_name` varchar(200) NOT NULL COMMENT '操作人姓名',
  `operate_time` datetime(3) NOT NULL COMMENT '操作时间',
  `operate_remarks` varchar(1000) COMMENT '操作说明',
  `operate_type` varchar(200) COMMENT '操作类型', -- 上传 or 修改
  `category_value_1` varchar(200) COMMENT '类别属性1', -- 预留
  `category_value_2` varchar(200) COMMENT '类别属性2', -- 预留
  `category_value_3` varchar(200) COMMENT '类别属性3', -- 预留
  `document_text` varchar(10000) NOT NULL COMMENT '上传文件正文', -- 最大字符量为21589约64m，1m约为52w个汉字
  `picture_link` varchar(200) COMMENT '上传图片地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '业务资料表';


-- -- 业务资料更新表
-- CREATE TABLE `update_file_table` (
--   `update_file_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '更新文件id',
--   `update_file_secret_level` varchar(50) NOT NULL COMMENT '更新文件密',
--   `update_file_link` varchar(200) NOT NULL COMMENT '更新文件链接',
--   `update_person_id` int(10) NOT NULL COMMENT '更新人id',
--   `update_time` date NOT NULL COMMENT '更新时间',
--   `update_explanation` varchar(1000) NOT NULL COMMENT '更新说明',
--   `update_remarks` varchar(1000) COMMENT '更新备注',
--   PRIMARY KEY (`update_file_id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '业务资料更新表';


-- 初始化数据
-- INSERT INTO `main_file_table` (`main_file_id`, `upload_file_id`, `update_file_id`)
-- VALUES (111, 222, 333);

