package okhttp3;

import ec.t;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import pc.a;
import qc.r;

/* compiled from: Handshake.kt */
/* loaded from: classes4.dex */
final class Handshake$peerCertificates$2 extends r implements a<List<? extends Certificate>> {
    final /* synthetic */ a<List<Certificate>> $peerCertificatesFn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    @Override // pc.a
    public final List<? extends Certificate> invoke() {
        List<? extends Certificate> i10;
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            i10 = t.i();
            return i10;
        }
    }
}
