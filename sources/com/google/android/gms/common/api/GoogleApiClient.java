package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.collection.a;
import androidx.fragment.app.q;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set<GoogleApiClient> zaa = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            String concat = String.valueOf(str).concat("  ");
            int i10 = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i10);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i10++;
            }
        }
    }

    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j10, TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i10) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t10) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t10) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l10) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(q qVar);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        private Account zaa;
        private final Set<Scope> zab;
        private final Set<Scope> zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map<Api<?>, com.google.android.gms.common.internal.zab> zah;
        private final Context zai;
        private final Map<Api<?>, Api.ApiOptions> zaj;
        private LifecycleActivity zak;
        private int zal;
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zap;
        private final ArrayList<ConnectionCallbacks> zaq;
        private final ArrayList<OnConnectionFailedListener> zar;

        @KeepForSdk
        public Builder(Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new a();
            this.zaj = new a();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList<>();
            this.zar = new ArrayList<>();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void zab(Api<O> api, O o10, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o10));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(Api<O> api, O o10, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            zab(api, o10, scopeArr);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        public Builder addScope(Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        public GoogleApiClient build() {
            boolean z10;
            boolean z11;
            Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings zaa = zaa();
            Map<Api<?>, com.google.android.gms.common.internal.zab> zad = zaa.zad();
            a aVar = new a();
            a aVar2 = new a();
            ArrayList arrayList = new ArrayList();
            Api<?> api = null;
            boolean z12 = false;
            for (Api<?> api2 : this.zaj.keySet()) {
                Api.ApiOptions apiOptions = this.zaj.get(api2);
                if (zad.get(api2) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar.put(api2, Boolean.valueOf(z11));
                zat zatVar = new zat(api2, z11);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (ClientSettings) apiOptions, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                aVar2.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    if (apiOptions != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String zad2 = api2.zad();
                        String zad3 = api.zad();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zad2).length() + 21 + String.valueOf(zad3).length());
                        sb2.append(zad2);
                        sb2.append(" cannot be used with ");
                        sb2.append(zad3);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            if (api != null) {
                if (!z12) {
                    if (this.zaa == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Preconditions.checkState(z10, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                    Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
                } else {
                    String zad4 = api.zad();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zad4).length() + 82);
                    sb3.append("With using ");
                    sb3.append(zad4);
                    sb3.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb3.toString());
                }
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, zaa, this.zao, this.zap, aVar, this.zaq, this.zar, aVar2, this.zal, zabe.zad(aVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        public Builder enableAutoManage(q qVar, int i10, OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) qVar);
            Preconditions.checkArgument(i10 >= 0, "clientId must be non-negative");
            this.zal = i10;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        public Builder setAccountName(String str) {
            Account account;
            if (str == null) {
                account = null;
            } else {
                account = new Account(str, "com.google");
            }
            this.zaa = account;
            return this;
        }

        public Builder setGravityForPopups(int i10) {
            this.zad = i10;
            return this;
        }

        public Builder setHandler(Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map<Api<?>, Api.ApiOptions> map = this.zaj;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        public Builder enableAutoManage(q qVar, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(qVar, 0, onConnectionFailedListener);
            return this;
        }

        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o10) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o10);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
