package jp.co.stnet.apps.domain.repository;

import jp.co.stnet.apps.domain.model.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    Users selectByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Users record);
}
