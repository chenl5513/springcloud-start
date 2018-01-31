package com.example.springcloudsimpleprovideruser.repo;

import com.example.springcloudsimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Title: UserPepository
 * Description: 请更改这里的描述
 * <p>
 * Copyright: Copyright (c) 悦升信息
 * Company: 济南悦升信息技术有限公司
 *
 * @author create 陈雷 2018/1/30
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserPepository extends JpaRepository<User, Long> {

}
