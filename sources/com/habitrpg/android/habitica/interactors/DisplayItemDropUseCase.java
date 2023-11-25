package com.habitrpg.android.habitica.interactors;

import ad.a1;
import ad.i;
import ad.l0;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionDataDrop;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.w;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: DisplayItemDropUseCase.kt */
/* loaded from: classes4.dex */
public final class DisplayItemDropUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = SoundManager.$stable;
    private final SoundManager soundManager;

    /* compiled from: DisplayItemDropUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final d context;
        private final TaskScoringResult data;
        private final boolean showQuestItems;
        private final ViewGroup snackbarTargetView;

        public RequestValues(TaskScoringResult taskScoringResult, d dVar, ViewGroup viewGroup, boolean z10) {
            q.i(dVar, "context");
            q.i(viewGroup, "snackbarTargetView");
            this.data = taskScoringResult;
            this.context = dVar;
            this.snackbarTargetView = viewGroup;
            this.showQuestItems = z10;
        }

        public final d getContext() {
            return this.context;
        }

        public final TaskScoringResult getData() {
            return this.data;
        }

        public final boolean getShowQuestItems() {
            return this.showQuestItems;
        }

        public final ViewGroup getSnackbarTargetView() {
            return this.snackbarTargetView;
        }
    }

    public DisplayItemDropUseCase(SoundManager soundManager) {
        q.i(soundManager, "soundManager");
        this.soundManager = soundManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    public Object run(RequestValues requestValues, Continuation<? super w> continuation) {
        String str;
        Integer questItemsFound;
        TaskDirectionDataDrop drop;
        TaskScoringResult data = requestValues.getData();
        if (data == null || (drop = data.getDrop()) == null || (str = drop.getDialog()) == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (((data == null || (questItemsFound = data.getQuestItemsFound()) == null) ? 0 : questItemsFound.intValue()) > 0 && requestValues.getShowQuestItems()) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            d context = requestValues.getContext();
            q.f(data);
            sb2.append(context.getString(R.string.quest_items_found, data.getQuestItemsFound()));
        }
        if (sb2.length() > 0) {
            i.d(l0.b(), a1.c(), null, new DisplayItemDropUseCase$run$2(requestValues, sb2, this, null), 2, null);
        }
        return w.f13270a;
    }
}
