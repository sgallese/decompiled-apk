package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final c3.b f4443a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f4444b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4445c = new a(UserVerificationMethods.USER_VERIFY_ALL);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f4446d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f4447a;

        /* renamed from: b  reason: collision with root package name */
        private p f4448b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f4447a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final p b() {
            return this.f4448b;
        }

        void c(p pVar, int i10, int i11) {
            a a10 = a(pVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f4447a.put(pVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(pVar, i10 + 1, i11);
            } else {
                a10.f4448b = pVar;
            }
        }

        a(int i10) {
            this.f4447a = new SparseArray<>(i10);
        }
    }

    private n(Typeface typeface, c3.b bVar) {
        this.f4446d = typeface;
        this.f4443a = bVar;
        this.f4444b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(c3.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f4444b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            androidx.core.os.t.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            androidx.core.os.t.b();
        }
    }

    public char[] c() {
        return this.f4444b;
    }

    public c3.b d() {
        return this.f4443a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f4443a.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a f() {
        return this.f4445c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface g() {
        return this.f4446d;
    }

    void h(p pVar) {
        boolean z10;
        androidx.core.util.i.h(pVar, "emoji metadata cannot be null");
        if (pVar.c() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.core.util.i.b(z10, "invalid metadata codepoint length");
        this.f4445c.c(pVar, 0, pVar.c() - 1);
    }
}
