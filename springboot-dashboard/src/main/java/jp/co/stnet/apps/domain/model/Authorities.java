package jp.co.stnet.apps.domain.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Authorities implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.authorities
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.authorities.username
     *
     * @mbg.generated
     */
    private String username;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.authorities.authority
     *
     * @mbg.generated
     */
    private String authority;
}