package org.exemple.data.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Message {
    private String echo;
    private int code;

}
