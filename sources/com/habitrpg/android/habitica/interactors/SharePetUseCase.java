package com.habitrpg.android.habitica.interactors;

import android.content.Context;
import com.habitrpg.android.habitica.interactors.UseCase;
import dc.w;
import qc.q;

/* compiled from: SharePetUseCase.kt */
/* loaded from: classes4.dex */
public final class SharePetUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = 0;

    /* compiled from: SharePetUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Context context;
        private final String message;
        private final String petKey;

        public RequestValues(String str, String str2, Context context) {
            q.i(str, "petKey");
            q.i(str2, "message");
            q.i(context, "context");
            this.petKey = str;
            this.message = str2;
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPetKey() {
            return this.petKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x015f -> B:48:0x0162). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.SharePetUseCase.RequestValues r14, kotlin.coroutines.Continuation<? super dc.w> r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.SharePetUseCase.run(com.habitrpg.android.habitica.interactors.SharePetUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
