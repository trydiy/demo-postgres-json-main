package jp.co.stnet.apps.domain.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Users implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.users
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.username
     *
     * @mbg.generated
     */
    private String username;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.password
     *
     * @mbg.generated
     */
    private String password;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;
}