package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import pc.a;
import qc.r;

/* compiled from: Handshake.kt */
/* loaded from: classes4.dex */
final class Handshake$Companion$handshake$1 extends r implements a<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // pc.a
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
