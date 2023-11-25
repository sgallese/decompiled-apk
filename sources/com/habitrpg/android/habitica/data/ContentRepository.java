package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.WorldState;
import dd.g;
import kotlin.coroutines.Continuation;

/* compiled from: ContentRepository.kt */
/* loaded from: classes4.dex */
public interface ContentRepository extends BaseRepository {

    /* compiled from: ContentRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object retrieveContent$default(ContentRepository contentRepository, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return contentRepository.retrieveContent(z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveContent");
        }

        public static /* synthetic */ Object retrieveWorldState$default(ContentRepository contentRepository, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return contentRepository.retrieveWorldState(z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveWorldState");
        }
    }

    g<WorldState> getWorldState();

    Object retrieveContent(boolean z10, Continuation<? super ContentResult> continuation);

    Object retrieveWorldState(boolean z10, Continuation<? super WorldState> continuation);
}
