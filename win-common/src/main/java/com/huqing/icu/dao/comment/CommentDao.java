package com.huqing.icu.dao.comment;

import com.huqing.icu.mapper.comment.CommentMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 评论dao
 *
 * @author huqing
 * @date 2024-01-08 20:50:59
 */
@Repository
public class CommentDao {

    @Resource
    private CommentMapper commentMapper;

    /*public Integer saveComment(Comment comment) {
        if (comment.getId() == null) {
            return commentMapper.insertSelective(comment);
        } else {
            return commentMapper.updateByPrimaryKeySelective(comment);
        }
    }

    public List<CommentDto> selectByCondition()*/

}
