package com.beteam.willu.blacklist;

import com.beteam.willu.common.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "blacklist")
public class Blacklist extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reciver_id") //받는 사람
    private Long reciver_id;

    @Column(name = "sender_id") //보내는 사람
    private Long sender_id;

    public Blacklist(Long reciver_id, Long sender_id) {
        this.reciver_id = reciver_id;
        this.sender_id = sender_id;
    }
}
