package okhttp3.internal.connection;

import ec.u;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Handshake;
import pc.a;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealConnection.kt */
/* loaded from: classes4.dex */
public final class RealConnection$connectTls$2 extends r implements a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // pc.a
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        int s10;
        handshake = this.this$0.handshake;
        q.f(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        s10 = u.s(peerCertificates, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
