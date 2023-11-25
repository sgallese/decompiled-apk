package v8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.p;
import g6.g;
import i6.u;
import java.nio.charset.Charset;
import r8.b0;
import s8.h;
import w8.i;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final h f25079c = new h();

    /* renamed from: d  reason: collision with root package name */
    private static final String f25080d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    private static final String f25081e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    private static final g6.e<b0, byte[]> f25082f = new g6.e() { // from class: v8.a
        @Override // g6.e
        public final Object apply(Object obj) {
            byte[] d10;
            d10 = b.d((b0) obj);
            return d10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final e f25083a;

    /* renamed from: b  reason: collision with root package name */
    private final g6.e<b0, byte[]> f25084b;

    b(e eVar, g6.e<b0, byte[]> eVar2) {
        this.f25083a = eVar;
        this.f25084b = eVar2;
    }

    public static b b(Context context, i iVar, com.google.firebase.crashlytics.internal.common.b0 b0Var) {
        u.f(context);
        g g10 = u.c().g(new com.google.android.datatransport.cct.a(f25080d, f25081e));
        g6.b b10 = g6.b.b("json");
        g6.e<b0, byte[]> eVar = f25082f;
        return new b(new e(g10.a("FIREBASE_CRASHLYTICS_REPORT", b0.class, b10, eVar), iVar.b(), b0Var), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(b0 b0Var) {
        return f25079c.G(b0Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<p> c(p pVar, boolean z10) {
        return this.f25083a.i(pVar, z10).getTask();
    }
}
