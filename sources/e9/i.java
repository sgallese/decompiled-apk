package e9;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes3.dex */
public class i implements b9.f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14152a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14153b = false;

    /* renamed from: c  reason: collision with root package name */
    private b9.b f14154c;

    /* renamed from: d  reason: collision with root package name */
    private final f f14155d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f14155d = fVar;
    }

    private void a() {
        if (!this.f14152a) {
            this.f14152a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // b9.f
    public b9.f b(String str) throws IOException {
        a();
        this.f14155d.h(this.f14154c, str, this.f14153b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(b9.b bVar, boolean z10) {
        this.f14152a = false;
        this.f14154c = bVar;
        this.f14153b = z10;
    }

    @Override // b9.f
    public b9.f d(boolean z10) throws IOException {
        a();
        this.f14155d.n(this.f14154c, z10, this.f14153b);
        return this;
    }
}
