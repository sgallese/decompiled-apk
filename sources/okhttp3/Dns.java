package okhttp3;

import ec.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import qc.q;

/* compiled from: Dns.kt */
/* loaded from: classes4.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* compiled from: Dns.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: Dns.kt */
        /* loaded from: classes4.dex */
        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) {
                List<InetAddress> b02;
                q.i(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    q.h(allByName, "getAllByName(hostname)");
                    b02 = p.b0(allByName);
                    return b02;
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(q.q("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
