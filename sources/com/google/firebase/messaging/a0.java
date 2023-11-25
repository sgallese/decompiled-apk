package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g9.j;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GmsRpc.java */
/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.e f11606a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f11607b;

    /* renamed from: c  reason: collision with root package name */
    private final Rpc f11608c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.b<ca.i> f11609d;

    /* renamed from: e  reason: collision with root package name */
    private final i9.b<g9.j> f11610e;

    /* renamed from: f  reason: collision with root package name */
    private final j9.e f11611f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(com.google.firebase.e eVar, f0 f0Var, i9.b<ca.i> bVar, i9.b<g9.j> bVar2, j9.e eVar2) {
        this(eVar, f0Var, new Rpc(eVar.j()), bVar, bVar2, eVar2);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(new s3.m(), new Continuation() { // from class: com.google.firebase.messaging.z
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String h10;
                h10 = a0.this.h(task2);
                return h10;
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f11606a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h(Task task) throws Exception {
        return f((Bundle) task.getResult(IOException.class));
    }

    private void i(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f11606a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f11607b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11607b.a());
        bundle.putString("app_ver_name", this.f11607b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((com.google.firebase.installations.f) Tasks.await(this.f11611f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f11611f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        g9.j jVar = this.f11610e.get();
        ca.i iVar = this.f11609d.get();
        if (jVar != null && iVar != null && (b10 = jVar.b("fire-iid")) != j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.getCode()));
            bundle.putString("Firebase-Client", iVar.a());
        }
    }

    private Task<Bundle> j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f11608c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<String> e() {
        return c(j(f0.c(this.f11606a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<?> k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    a0(com.google.firebase.e eVar, f0 f0Var, Rpc rpc, i9.b<ca.i> bVar, i9.b<g9.j> bVar2, j9.e eVar2) {
        this.f11606a = eVar;
        this.f11607b = f0Var;
        this.f11608c = rpc;
        this.f11609d = bVar;
        this.f11610e = bVar2;
        this.f11611f = eVar2;
    }
}
