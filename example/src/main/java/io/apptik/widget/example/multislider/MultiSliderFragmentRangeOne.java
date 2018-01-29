/*
 * Copyright (C) 2014 Kalin Maldzhanski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apptik.widget.example.multislider;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.apptik.widget.MultiSlider;

public class MultiSliderFragmentRangeOne extends Fragment {


    public MultiSliderFragmentRangeOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View v = inflater.inflate(R.layout.example, container, false);
        final TextView min1 = (TextView) v.findViewById(R.id.minValue1);
        final TextView max1 = (TextView) v.findViewById(R.id.maxValue1);

        MultiSlider multiSlider1 = (MultiSlider) v.findViewById(R.id.range_slider1);



        min1.setText(String.valueOf(multiSlider1.getThumb(0).getValue()));
        max1.setText(String.valueOf(multiSlider1.getThumb(1).getValue()));



        multiSlider1.setOnThumbValueChangeListener(new MultiSlider.SimpleChangeListener() {
            @Override
            public void onValueChanged(MultiSlider multiSlider, MultiSlider.Thumb thumb, int
                    thumbIndex, int value) {
                if (thumbIndex == 0) {
                    min1.setText(String.valueOf(value));
                } else {
                    max1.setText(String.valueOf(value));
                }
            }
        });
        return v;
    }
}
