package com.habitrpg.android.habitica.interactors;

import android.content.Context;
import com.habitrpg.android.habitica.interactors.UseCase;
import dc.w;
import qc.q;

/* compiled from: ShareMountUseCase.kt */
/* loaded from: classes4.dex */
public final class ShareMountUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = 0;

    /* compiled from: ShareMountUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Context context;
        private final String message;
        private final String mountKey;

        public RequestValues(String str, String str2, Context context) {
            q.i(str, "mountKey");
            q.i(str2, "message");
            q.i(context, "context");
            this.mountKey = str;
            this.message = str2;
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getMountKey() {
            return this.mountKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0149 -> B:44:0x014c). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.ShareMountUseCase.RequestValues r14, kotlin.coroutines.Continuation<? super dc.w> r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.ShareMountUseCase.run(com.habitrpg.android.habitica.interactors.ShareMountUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
