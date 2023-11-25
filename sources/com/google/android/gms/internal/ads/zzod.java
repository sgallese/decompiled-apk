package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzod implements zzma, zzoe {
    private final Context zza;
    private final zzof zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzcf zzn;
    private zzoc zzo;
    private zzoc zzp;
    private zzoc zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcv zze = new zzcv();
    private final zzct zzf = new zzct();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzod(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzob zzobVar = new zzob(zzob.zza);
        this.zzb = zzobVar;
        zzobVar.zzh(this);
    }

    public static zzod zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a10 = l0.a(context.getSystemService("media_metrics"));
        if (a10 != null) {
            createPlaybackSession = a10.createPlaybackSession();
            return new zzod(context, createPlaybackSession);
        }
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzfk.zzi(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.zzj;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzam zzamVar, int i10) {
        int i11;
        if (zzfk.zzD(this.zzs, zzamVar)) {
            return;
        }
        if (this.zzs == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzs = zzamVar;
        zzx(0, j10, zzamVar, i11);
    }

    private final void zzu(long j10, zzam zzamVar, int i10) {
        int i11;
        if (zzfk.zzD(this.zzt, zzamVar)) {
            return;
        }
        if (this.zzt == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzt = zzamVar;
        zzx(2, j10, zzamVar, i11);
    }

    private final void zzv(zzcw zzcwVar, zzts zztsVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztsVar == null || (zza = zzcwVar.zza(zztsVar.zza)) == -1) {
            return;
        }
        int i10 = 0;
        zzcwVar.zzd(zza, this.zzf, false);
        zzcwVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zze.zzd;
        int i11 = 2;
        if (zzbiVar != null) {
            int zzm = zzfk.zzm(zzbiVar.zzb);
            if (zzm != 0) {
                if (zzm != 1) {
                    if (zzm != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        builder.setStreamType(i10);
        zzcv zzcvVar = this.zze;
        if (zzcvVar.zzo != -9223372036854775807L && !zzcvVar.zzm && !zzcvVar.zzj && !zzcvVar.zzb()) {
            builder.setMediaDurationMillis(zzfk.zzr(this.zze.zzo));
        }
        if (true != this.zze.zzb()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.zzz = true;
    }

    private final void zzw(long j10, zzam zzamVar, int i10) {
        int i11;
        if (zzfk.zzD(this.zzr, zzamVar)) {
            return;
        }
        if (this.zzr == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzr = zzamVar;
        zzx(1, j10, zzamVar, i11);
    }

    private final void zzx(int i10, long j10, zzam zzamVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        timeSinceCreatedMillis = z1.a(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = zzamVar.zzl;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzamVar.zzm;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzamVar.zzj;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = zzamVar.zzi;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = zzamVar.zzr;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = zzamVar.zzs;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = zzamVar.zzz;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = zzamVar.zzA;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = zzamVar.zzd;
            if (str5 != null) {
                int i18 = zzfk.zza;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzamVar.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean zzy(zzoc zzocVar) {
        if (zzocVar != null && zzocVar.zzc.equals(this.zzb.zze())) {
            return true;
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzc(zzly zzlyVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar != null && zztsVar.zzb()) {
            return;
        }
        zzs();
        this.zzi = str;
        playerName = y1.a().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.1.0");
        this.zzj = playerVersion;
        zzv(zzlyVar.zzb, zzlyVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzd(zzly zzlyVar, String str, boolean z10) {
        zzts zztsVar = zzlyVar.zzd;
        if ((zztsVar == null || !zztsVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzf(zzly zzlyVar, int i10, long j10, long j11) {
        long longValue;
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar != null) {
            String zzf = this.zzb.zzf(zzlyVar.zzb, zztsVar);
            Long l10 = (Long) this.zzh.get(zzf);
            Long l11 = (Long) this.zzg.get(zzf);
            HashMap hashMap = this.zzh;
            long j12 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(zzf, Long.valueOf(longValue + j10));
            HashMap hashMap2 = this.zzg;
            if (l11 != null) {
                j12 = l11.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(j12 + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzg(zzly zzlyVar, zzto zztoVar) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null) {
            return;
        }
        zzam zzamVar = zztoVar.zzb;
        zzamVar.getClass();
        zzoc zzocVar = new zzoc(zzamVar, 0, this.zzb.zzf(zzlyVar.zzb, zztsVar));
        int i10 = zztoVar.zza;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    this.zzq = zzocVar;
                    return;
                }
            } else {
                this.zzp = zzocVar;
                return;
            }
        }
        this.zzo = zzocVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01e8, code lost:
    
        if (r8 != 1) goto L141;
     */
    @Override // com.google.android.gms.internal.ads.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcp r19, com.google.android.gms.internal.ads.zzlz r20) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.zzi(com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzlz):void");
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzlyVar, zzcf zzcfVar) {
        this.zzn = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzm(zzly zzlyVar, zzco zzcoVar, zzco zzcoVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzo(zzly zzlyVar, zzid zzidVar) {
        this.zzw += zzidVar.zzg;
        this.zzx += zzidVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzlyVar, zzdn zzdnVar) {
        zzoc zzocVar = this.zzo;
        if (zzocVar != null) {
            zzam zzamVar = zzocVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzb = zzamVar.zzb();
                zzb.zzX(zzdnVar.zzc);
                zzb.zzF(zzdnVar.zzd);
                this.zzo = new zzoc(zzb.zzY(), 0, zzocVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzk(zzly zzlyVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zze(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzh(zzly zzlyVar, int i10, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzn(zzly zzlyVar, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzp(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzlyVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z10) {
    }
}
