package x0;

import a1.k4;
import a1.s3;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;
import qc.q;

/* compiled from: Alpha.kt */
/* loaded from: classes.dex */
public final class a {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10) {
        boolean z10;
        androidx.compose.ui.e b10;
        q.i(eVar, "<this>");
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            b10 = androidx.compose.ui.graphics.c.b(eVar, (r41 & 1) != 0 ? 1.0f : 0.0f, (r41 & 2) != 0 ? 1.0f : 0.0f, (r41 & 4) == 0 ? f10 : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : 0.0f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & 128) != 0 ? 0.0f : 0.0f, (r41 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? 0.0f : 0.0f, (r41 & 512) != 0 ? 8.0f : 0.0f, (r41 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? androidx.compose.ui.graphics.g.f2458b.a() : 0L, (r41 & RecyclerView.m.FLAG_MOVED) != 0 ? k4.a() : null, (r41 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : true, (r41 & 8192) != 0 ? null : null, (r41 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? s3.a() : 0L, (r41 & 32768) != 0 ? s3.a() : 0L, (r41 & 65536) != 0 ? androidx.compose.ui.graphics.b.f2438a.a() : 0);
            return b10;
        }
        return eVar;
    }
}
