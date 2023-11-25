package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeh {
    public static void zza() throws zzeg {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (!z10) {
            return;
        }
        throw new zzeg(sb2.toString());
    }

    public static void zzb(boolean z10, String str) throws zzeg {
        if (z10) {
            return;
        }
        throw new zzeg(str);
    }

    public static boolean zzc(Context context) {
        int i10 = zzfk.zza;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(zzfk.zzc) || "XT1650".equals(zzfk.zzd))) {
            return false;
        }
        if (i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return false;
        }
        return zzef.zzk("EGL_EXT_protected_content");
    }

    public static boolean zzd() {
        int i10 = zzfk.zza;
        if (zzef.zzk("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }
}
