package com.huqing.icu.model.comment;

import lombok.Data;

import java.io.Serializable;


/**
 * 微信小程序登录接口的响应结果
 *
 * @author huqing
 * @date 2024-01-04 20:24:32
 */
@Data
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Coloumn(name = "user_id")
    private Long userId;

    /**
     * 用户角色类型 1-正常用户 2-后台运营
     */
    @Coloumn(name = "user_role_type")
    private Integer userRoleType;

    /**
     * 业务id
     */
    @Coloumn(name = "bus_id")
    private Long busId;

    /**
     * 业务类型 1-评论
     */
    @Coloumn(name = "bus_type")
    private Integer busType;

    /**
     * 评论内容
     */
    @Coloumn(name = "content")
    private String content;

    /**
     * 回复ID
     */
    @Coloumn(name = "reply_id")
    private Long replyId;

    /**
     * 真实的点赞数
     */
    @Coloumn(name = "actual_like_num")
    private Integer actualLikeNum;

    /**
     * 是否置顶 0-否 1-是
     */
    @Coloumn(name = "is_top")
    private Integer isTop;

}
