package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.SocketAdapter;
import qc.q;

/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes4.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private final Factory socketAdapterFactory;

    /* compiled from: DeferredSocketAdapter.kt */
    /* loaded from: classes4.dex */
    public interface Factory {
        SocketAdapter create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        q.i(factory, "socketAdapterFactory");
        this.socketAdapterFactory = factory;
    }

    private final synchronized SocketAdapter getDelegate(SSLSocket sSLSocket) {
        if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket)) {
            this.delegate = this.socketAdapterFactory.create(sSLSocket);
        }
        return this.delegate;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        q.i(sSLSocket, "sslSocket");
        q.i(list, "protocols");
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            delegate.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        q.i(sSLSocket, "sslSocket");
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate == null) {
            return null;
        }
        return delegate.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        q.i(sSLSocket, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
