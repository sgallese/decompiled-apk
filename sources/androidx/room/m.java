package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
class m implements x3.c {

    /* renamed from: f  reason: collision with root package name */
    private final Context f7069f;

    /* renamed from: m  reason: collision with root package name */
    private final String f7070m;

    /* renamed from: p  reason: collision with root package name */
    private final File f7071p;

    /* renamed from: q  reason: collision with root package name */
    private final int f7072q;

    /* renamed from: r  reason: collision with root package name */
    private final x3.c f7073r;

    /* renamed from: s  reason: collision with root package name */
    private a f7074s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7075t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, String str, File file, int i10, x3.c cVar) {
        this.f7069f = context;
        this.f7070m = str;
        this.f7071p = file;
        this.f7072q = i10;
        this.f7073r = cVar;
    }

    private void b(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f7070m != null) {
            channel = Channels.newChannel(this.f7069f.getAssets().open(this.f7070m));
        } else if (this.f7071p != null) {
            channel = new FileInputStream(this.f7071p).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f7069f.getCacheDir());
        createTempFile.deleteOnExit();
        v3.d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (createTempFile.renameTo(file)) {
        } else {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void d() {
        boolean z10;
        String databaseName = getDatabaseName();
        File databasePath = this.f7069f.getDatabasePath(databaseName);
        a aVar = this.f7074s;
        if (aVar != null && !aVar.f6969j) {
            z10 = false;
        } else {
            z10 = true;
        }
        v3.a aVar2 = new v3.a(databaseName, this.f7069f.getFilesDir(), z10);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    b(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.f7074s == null) {
                aVar2.c();
                return;
            } else {
                try {
                    int c10 = v3.c.c(databasePath);
                    int i10 = this.f7072q;
                    if (c10 == i10) {
                        aVar2.c();
                        return;
                    } else if (this.f7074s.a(c10, i10)) {
                        aVar2.c();
                        return;
                    } else {
                        if (this.f7069f.deleteDatabase(databaseName)) {
                            try {
                                b(databasePath);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.c();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar2.c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // x3.c
    public synchronized x3.b X() {
        if (!this.f7075t) {
            d();
            this.f7075t = true;
        }
        return this.f7073r.X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a aVar) {
        this.f7074s = aVar;
    }

    @Override // x3.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7073r.close();
        this.f7075t = false;
    }

    @Override // x3.c
    public String getDatabaseName() {
        return this.f7073r.getDatabaseName();
    }

    @Override // x3.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f7073r.setWriteAheadLoggingEnabled(z10);
    }
}
