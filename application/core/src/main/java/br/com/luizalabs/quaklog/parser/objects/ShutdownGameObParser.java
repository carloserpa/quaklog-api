package br.com.luizalabs.quaklog.parser.objects;

import br.com.luizalabs.quaklog.parser.ParseObject;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
public class ShutdownGameObParser implements ParseObject {
    @NonNull
    private String gameTime;
}