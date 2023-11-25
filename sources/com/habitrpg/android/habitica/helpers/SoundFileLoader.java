package com.habitrpg.android.habitica.helpers;

import android.content.Context;
import android.os.Environment;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import java.io.File;
import okhttp3.OkHttpClient;
import qc.q;

/* compiled from: SoundFileLoader.kt */
/* loaded from: classes4.dex */
public final class SoundFileLoader {
    public static final int $stable = 8;
    private final OkHttpClient client;
    private final Context context;

    public SoundFileLoader(Context context) {
        q.i(context, "context");
        this.context = context;
        this.client = new OkHttpClient();
    }

    private final String getExternalCacheDir() {
        File file;
        HabiticaBaseApplication companion = HabiticaBaseApplication.Companion.getInstance(this.context);
        if (companion != null) {
            file = companion.getExternalFilesDir(Environment.DIRECTORY_NOTIFICATIONS);
        } else {
            file = null;
        }
        if (file == null) {
            return null;
        }
        return file.getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFullAudioFilePath(SoundFile soundFile) {
        return getExternalCacheDir() + File.separator + soundFile.getFilePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:21:0x0080). Please submit an issue!!! */
    @android.annotation.SuppressLint({"SetWorldReadable", "ReturnCount"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object download(java.util.List<com.habitrpg.android.habitica.helpers.SoundFile> r9, kotlin.coroutines.Continuation<? super java.util.List<com.habitrpg.android.habitica.helpers.SoundFile>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.helpers.SoundFileLoader$download$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.helpers.SoundFileLoader$download$1 r0 = (com.habitrpg.android.habitica.helpers.SoundFileLoader$download$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.SoundFileLoader$download$1 r0 = new com.habitrpg.android.habitica.helpers.SoundFileLoader$download$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r9 = r0.L$3
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$1
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.helpers.SoundFileLoader r5 = (com.habitrpg.android.habitica.helpers.SoundFileLoader) r5
            dc.n.b(r10)
            goto L80
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            dc.n.b(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = ec.r.s(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r5 = r8
            r2 = r9
            r9 = r10
        L58:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r2.next()
            com.habitrpg.android.habitica.helpers.SoundFile r10 = (com.habitrpg.android.habitica.helpers.SoundFile) r10
            ad.g0 r4 = ad.a1.b()
            com.habitrpg.android.habitica.helpers.SoundFileLoader$download$2$1 r6 = new com.habitrpg.android.habitica.helpers.SoundFileLoader$download$2$1
            r7 = 0
            r6.<init>(r5, r10, r7)
            r0.L$0 = r5
            r0.L$1 = r9
            r0.L$2 = r2
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r10 = ad.g.g(r4, r6, r0)
            if (r10 != r1) goto L7f
            return r1
        L7f:
            r4 = r9
        L80:
            com.habitrpg.android.habitica.helpers.SoundFile r10 = (com.habitrpg.android.habitica.helpers.SoundFile) r10
            r9.add(r10)
            r9 = r4
            goto L58
        L87:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.SoundFileLoader.download(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
