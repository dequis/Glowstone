package net.glowstone.net.message.play.player;

import com.flowpowered.networking.Message;
import lombok.Data;

@Data
public final class CameraMessage implements Message {

    private final int cameraId;

}
