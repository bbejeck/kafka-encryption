/*-
 * #%L
 * Kafka Encryption
 * %%
 * Copyright (C) 2018 Quicksign
 * %%
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
 * #L%
 */
package io.quicksign.kafka.crypto.pairing.serializer;

import org.apache.kafka.common.serialization.Serializer;

/**
 * A factory to pair 2 {@link Serializer}
 *
 * Main usage is with <i>traditional</i> Kafka Producer
 */
public interface SerializerPairFactory {

    /**
     * Pair the keySerializer with the value serializer
     * @param keySerializer
     * @param valueSerializer
     * @param <K>
     * @param <V>
     * @return
     */
    <K, V> SerializerPair<K, V> build(Serializer<K> keySerializer, Serializer<V> valueSerializer);
}
