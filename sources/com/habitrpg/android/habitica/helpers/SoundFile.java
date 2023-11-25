package com.habitrpg.android.habitica.helpers;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import java.io.File;
import qc.q;

/* compiled from: SoundFile.kt */
/* loaded from: classes4.dex */
public final class SoundFile {
    public static final int $stable = 8;
    private File file;
    private final String fileName;
    private MediaPlayer player;
    private boolean playerPrepared;
    private final String theme;

    public SoundFile(String str, String str2) {
        q.i(str, "theme");
        q.i(str2, "fileName");
        this.theme = str;
        this.fileName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$0(SoundFile soundFile, MediaPlayer mediaPlayer) {
        q.i(soundFile, "this$0");
        mediaPlayer.release();
        soundFile.player = null;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getFilePath() {
        return this.theme + "_" + this.fileName + ".mp3";
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getWebUrl() {
        return "https://s3.amazonaws.com/habitica-assets/mobileApp/sounds/" + this.theme + "/" + this.fileName + ".mp3";
    }

    public final void play() {
        boolean z10;
        String str;
        boolean z11;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            File file = this.file;
            String str2 = null;
            if (file != null) {
                str = file.getPath();
            } else {
                str = null;
            }
            if (str != null) {
                MediaPlayer mediaPlayer2 = this.player;
                if (mediaPlayer2 != null && !mediaPlayer2.isPlaying()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    MediaPlayer mediaPlayer3 = this.player;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                    }
                    this.player = null;
                }
                MediaPlayer mediaPlayer4 = new MediaPlayer();
                this.player = mediaPlayer4;
                mediaPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.habitrpg.android.habitica.helpers.d
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer5) {
                        SoundFile.play$lambda$0(SoundFile.this, mediaPlayer5);
                    }
                });
                try {
                    MediaPlayer mediaPlayer5 = this.player;
                    if (mediaPlayer5 != null) {
                        File file2 = this.file;
                        if (file2 != null) {
                            str2 = file2.getPath();
                        }
                        mediaPlayer5.setDataSource(str2);
                    }
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(3).build();
                    MediaPlayer mediaPlayer6 = this.player;
                    if (mediaPlayer6 != null) {
                        mediaPlayer6.setAudioAttributes(build);
                    }
                    MediaPlayer mediaPlayer7 = this.player;
                    if (mediaPlayer7 != null) {
                        mediaPlayer7.prepare();
                    }
                    this.playerPrepared = true;
                    MediaPlayer mediaPlayer8 = this.player;
                    if (mediaPlayer8 != null) {
                        mediaPlayer8.setVolume(100.0f, 100.0f);
                    }
                    MediaPlayer mediaPlayer9 = this.player;
                    if (mediaPlayer9 != null) {
                        mediaPlayer9.setLooping(false);
                    }
                    MediaPlayer mediaPlayer10 = this.player;
                    if (mediaPlayer10 != null) {
                        mediaPlayer10.start();
                    }
                } catch (IllegalStateException unused) {
                } catch (Exception e10) {
                    ExceptionHandler.Companion.reportError(e10);
                }
            }
        }
    }

    public final void setFile(File file) {
        this.file = file;
    }
}
