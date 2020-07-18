from google.cloud import texttospeech
from google.cloud.texttospeech import enums
from mutagen.mp3 import MP3
import pygame, time, os


def gender_select():
    gender = int(input("성별을 입력하세요 (1.Male/ 2.Female): "))
    if (gender == 1):
        voice = texttospeech.types.VoiceSelectionParams(language_code='Ko-KOR',
                                                        ssml_gender=texttospeech.enums.SsmlVoiceGender.MALE)
    elif (gender == 2):
        voice = texttospeech.types.VoiceSelectionParams(language_code='Ko-KOR',
                                                        ssml_gender=texttospeech.enums.SsmlVoiceGender.FEMALE)
    return voice

def write_mp3_file(filename):
    try:
        with open(filename, 'wb+') as speak:
            speak.write(response.audio_content)
            print('Audio content written to file' + filename)
        return
    except :
        return 0

def play_Speech(filename):
    pygame.mixer.init()
    pygame.mixer.music.load(filename)
    audio = MP3(filename)
    pygame.mixer.music.play()
    time.sleep(audio.info.length+0.2)
    pygame.quit()


def naming():
    chk = 0
    filename = "output" + str(chk) + ".mp3"
    write_mp3_file(filename) // 1번 호출
    if write_mp3_file(filename) == 0: // 2번호출
        chk += 1
        filename = "output" + str(chk) + ".mp3"
        write_mp3_file(filename)
    play_Speech(filename)

client = texttospeech.TextToSpeechClient()
voice = gender_select()


while(True):
    tts = str(input("할말을 입력하세요 (! : exit) : "))

    if (tts == "!"):
        pygame.quit()
        exit()

    input_text = texttospeech.types.SynthesisInput(text=tts)
    audio_config = texttospeech.types.AudioConfig(audio_encoding=texttospeech.enums.AudioEncoding.MP3)
    response = client.synthesize_speech(input_text, voice, audio_config)
    naming()
