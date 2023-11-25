package w4;

import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.coroutines.Continuation;
import okio.r0;
import t4.o0;
import t4.p0;
import w4.i;

/* compiled from: FileFetcher.kt */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final File f25379a;

    /* compiled from: FileFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a<File> {
        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(File file, b5.l lVar, q4.g gVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f25379a = file;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        String c10;
        o0 d10 = p0.d(r0.a.d(r0.f20670m, this.f25379a, false, 1, null), null, null, null, 14, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        c10 = nc.g.c(this.f25379a);
        return new m(d10, singleton.getMimeTypeFromExtension(c10), t4.f.DISK);
    }
}
