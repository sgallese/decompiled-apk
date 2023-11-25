package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.inventory.Customization;
import dd.g;
import java.util.List;

/* compiled from: CustomizationRepository.kt */
/* loaded from: classes4.dex */
public interface CustomizationRepository extends BaseRepository {
    g<List<Customization>> getCustomizations(String str, String str2, boolean z10);
}
