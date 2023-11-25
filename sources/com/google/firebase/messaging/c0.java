package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: ImageDownload.java */
/* loaded from: classes3.dex */
public class c0 implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    private final URL f11620f;

    /* renamed from: m  reason: collision with root package name */
    private volatile Future<?> f11621m;

    /* renamed from: p  reason: collision with root package name */
    private Task<Bitmap> f11622p;

    private c0(URL url) {
        this.f11620f = url;
    }

    private byte[] d() throws IOException {
        URLConnection openConnection = this.f11620f.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f11620f);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static c0 e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new c0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(c());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Bitmap c() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f11620f);
        }
        byte[] d10 = d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d10, 0, d10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f11620f);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f11620f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11621m.cancel(true);
    }

    public Task<Bitmap> j() {
        return (Task) Preconditions.checkNotNull(this.f11622p);
    }

    public void q(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11621m = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.m(taskCompletionSource);
            }
        });
        this.f11622p = taskCompletionSource.getTask();
    }
}
