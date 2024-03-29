package com.chensoul.distribute.transaction.db132.dao;

import com.chensoul.distribute.transaction.db132.model.AccountB;
import com.chensoul.distribute.transaction.db132.model.AccountBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountBMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    long countByExample(AccountBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int deleteByExample(AccountBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int insert(AccountB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int insertSelective(AccountB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    List<AccountB> selectByExample(AccountBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    AccountB selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") AccountB record, @Param("example") AccountBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int updateByExample(@Param("record") AccountB record, @Param("example") AccountBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int updateByPrimaryKeySelective(AccountB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_b
     *
     * @mbg.generated Thu Oct 03 14:33:42 CST 2019
     */
    int updateByPrimaryKey(AccountB record);
}
