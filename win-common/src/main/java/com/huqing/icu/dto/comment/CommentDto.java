package com.huqing.icu.dto.comment;

import com.huqing.icu.model.comment.Comment;
import lombok.Data;

/**
 * 评论dto
 *
 * @author huqing
 * @date 2024-01-04 21:03:17
 */
@Data
public class CommentDto extends Comment {

    @ApiModelProperty(notes = "用户昵称")
    private String nickName;

    private String iconUrl;
}
